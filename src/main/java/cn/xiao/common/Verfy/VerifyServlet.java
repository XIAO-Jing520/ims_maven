package cn.xiao.common.Verfy;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 生成验证码
 */
@Controller
public class VerifyServlet{

	@RequestMapping("/createCode")
	public void createImg(HttpSession session,HttpServletResponse response){
//		System.out.println("进入验证码");
		// TODO Auto-generated method stub
		try {
			//生成验证码中的随机数
			String randomData = createRandomData();
			//将生成的验证码保存至session中
			session.setAttribute("vcode", randomData);
			
			//生成画布
			BufferedImage image = new BufferedImage(70,25,BufferedImage.TYPE_INT_RGB);
			//生成2d画笔
			Graphics2D d2 = image.createGraphics();
			//设置画笔的颜色
			d2.setColor(Color.white);
			//给画布上颜色
			d2.fillRect(0, 0, 70, 25);
			
			d2.setStroke(new BasicStroke(2.0f));
			
			Random random = new Random();
			//画干扰线
			for(int i=0;i<200;i++){
				int r = random.nextInt(255);
				int g = random.nextInt(255);
				int b = random.nextInt(255);
				
				int x = random.nextInt(70);
				int y = random.nextInt(25);
				
				Color c = new Color(r, g, b);
				//再次设置画笔的颜色
				d2.setColor(c);
				
				//画干扰线
				d2.drawLine(x, y, x, y);
			}
			
			//再次设置画笔的颜色
			d2.setColor(Color.red);
			d2.setFont(new Font("宋体",Font.BOLD,24));
			//将生成的随机数放在画布上
			d2.drawString(randomData, 10, 25);
			
			//设置数据的响应类型
			response.setContentType("image/png");
			OutputStream out = response.getOutputStream();
			//将图片响应至客户端（浏览器）
			ImageIO.write(image, "png",out);
			
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private String createRandomData() {
		// TODO Auto-generated method stub
		StringBuffer sbf = new StringBuffer();
		Random random = new Random();
		for(int i=0;i<4;i++){
			sbf.append(random.nextInt(10));
		}
		return sbf.toString();
	}

}
