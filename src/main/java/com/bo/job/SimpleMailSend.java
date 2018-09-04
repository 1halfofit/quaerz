package com.bo.job;

import com.bo.bean.Mail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileInputStream;

public class SimpleMailSend {
    public static void main(String[] args) throws MessagingException {
        //初始化Spring环境
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        //获取mailSender邮件发送类
        JavaMailSenderImpl mailSender = (JavaMailSenderImpl) context.getBean("mailSender");
        //创建邮件发送实体对象
        Mail mail = new Mail();
        //发件人
        mail.setFrom("1084877426@qq.com");
        //收件人
        mail.setTo("1084877426@qq.com");
        //主题
        mail.setSubject("这是测试邮件");
        //内容
        mail.setContent("java");
//
//        //创建简单文本邮件对象
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom(mail.getFrom());
//        message.setTo(mail.getTo());
//        message.setSubject(mail.getSubject());
//        message.setText(mail.getContent());
//        创建带附件的邮件内容对象
        MimeMessage message = mailSender.createMimeMessage();
        //multipart开启多部件
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(mail.getFrom());
        helper.setTo(mail.getTo());
        helper.setSubject(mail.getSubject());
        helper.setText(mail.getContent());

//        // 添加附件
//        FileSystemResource resource = new FileSystemResource(new File("C:\\Users\\ibm\\Desktop\\radio.jpeg"));
//        helper.addAttachment("饼状图", resource);
        helper.setText("<html>\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><title>query data</title>\n" +
                "<style type=\"text/css\"> <!--\n" +
                ".normal {  font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; color: #000000}\n" +
                ".medium {  font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 15px; font-weight: bold; color: #000000; text-decoration: none}\n" +
                "--></style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3>query result</h3><table border=1>\n" +
                "<tr>\n" +
                "<td bgcolor=silver class='medium'>ID</td><td bgcolor=silver class='medium'>MobileNumber</td><td bgcolor=silver class='medium'>MobileArea</td><td bgcolor=silver class='medium'>MobileType</td><td bgcolor=silver class='medium'>AreaCode</td><td bgcolor=silver class='medium'>PostCode</td></tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>1</td>\n" +
                "<td class='normal' valign='top'>1300000</td>\n" +
                "<td class='normal' valign='top'>山东 济南</td>\n" +
                "<td class='normal' valign='top'>中国联通GSM</td>\n" +
                "<td class='normal' valign='top'>0531</td>\n" +
                "<td class='normal' valign='top'>250000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>64316</td>\n" +
                "<td class='normal' valign='top'>1366237</td>\n" +
                "<td class='normal' valign='top'>广东 广州</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>020</td>\n" +
                "<td class='normal' valign='top'>510000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>64317</td>\n" +
                "<td class='normal' valign='top'>1366238</td>\n" +
                "<td class='normal' valign='top'>广东 广州</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>020</td>\n" +
                "<td class='normal' valign='top'>510000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>64318</td>\n" +
                "<td class='normal' valign='top'>1366239</td>\n" +
                "<td class='normal' valign='top'>广东 广州</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>020</td>\n" +
                "<td class='normal' valign='top'>510000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>64319</td>\n" +
                "<td class='normal' valign='top'>1366240</td>\n" +
                "<td class='normal' valign='top'>广东 广州</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>020</td>\n" +
                "<td class='normal' valign='top'>510000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>64320</td>\n" +
                "<td class='normal' valign='top'>1366241</td>\n" +
                "<td class='normal' valign='top'>广东 广州</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>020</td>\n" +
                "<td class='normal' valign='top'>510000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65528</td>\n" +
                "<td class='normal' valign='top'>1367449</td>\n" +
                "<td class='normal' valign='top'>吉林 白山</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0439</td>\n" +
                "<td class='normal' valign='top'>134300</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65529</td>\n" +
                "<td class='normal' valign='top'>1367450</td>\n" +
                "<td class='normal' valign='top'>黑龙江 哈尔滨</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0451</td>\n" +
                "<td class='normal' valign='top'>150000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65530</td>\n" +
                "<td class='normal' valign='top'>1367451</td>\n" +
                "<td class='normal' valign='top'>黑龙江 哈尔滨</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0451</td>\n" +
                "<td class='normal' valign='top'>150000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65531</td>\n" +
                "<td class='normal' valign='top'>1367452</td>\n" +
                "<td class='normal' valign='top'>黑龙江 齐齐哈尔</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0452</td>\n" +
                "<td class='normal' valign='top'>161000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65532</td>\n" +
                "<td class='normal' valign='top'>1367453</td>\n" +
                "<td class='normal' valign='top'>黑龙江 牡丹江</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0453</td>\n" +
                "<td class='normal' valign='top'>157000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65533</td>\n" +
                "<td class='normal' valign='top'>1367454</td>\n" +
                "<td class='normal' valign='top'>黑龙江 佳木斯</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0454</td>\n" +
                "<td class='normal' valign='top'>154000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65534</td>\n" +
                "<td class='normal' valign='top'>1367455</td>\n" +
                "<td class='normal' valign='top'>黑龙江 绥化</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0455</td>\n" +
                "<td class='normal' valign='top'>152000</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td class='normal' valign='top'>65535</td>\n" +
                "<td class='normal' valign='top'>1367456</td>\n" +
                "<td class='normal' valign='top'>黑龙江 黑河</td>\n" +
                "<td class='normal' valign='top'>中国移动GSM</td>\n" +
                "<td class='normal' valign='top'>0456</td>\n" +
                "<td class='normal' valign='top'>164300</td>\n" +
                "</tr>\n" +
                "</table>\n" +
                "</body></html>", true);
        //发送邮件
        mailSender.send(message);

        System.out.println("简单文本邮件发送成功");

    }

}
