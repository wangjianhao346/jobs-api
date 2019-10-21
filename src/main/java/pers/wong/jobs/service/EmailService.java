package pers.wong.jobs.service;


import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class EmailService {
//    @Resource
//    private JavaMailSender javaMailSender;
//    @Resource
//    private TemplateEngine templateEngine;
//    @Resource
//    private UserInfoMapper userInfoMapper;
//    @Resource
//    private UserMapper userMapper;
//
//
//    public Boolean getVerificationCodeEmail(String email) {
//        Map<String, Object> valueMap = new HashMap<>();
//        Random random = new Random();
//        Integer value = random.nextInt(899999) + 100000;
//        valueMap.put("code", value);
//        MimeMessage message = javaMailSender.createMimeMessage();
//        try {
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom("946669782@qq.com");
//            helper.setTo(email);
//            helper.setSubject("验证码");
////            helper.setText(htmlTemplate("测试code"), true);
//            // 添加正文（使用thymeleaf模板）
//            Context context = new Context();
//            context.setVariables(valueMap);
//            String content = this.templateEngine.process("EmailTemplate", context);
//            helper.setText(content, true);
//            javaMailSender.send(message);
//            Jedis jedis = new Jedis();
//            jedis.set(email, value.toString()); // 将值存入redis
//            jedis.expire(email, 300);   // 设置过期时间
//        } catch (MessagingException exception) {
//            exception.getCause();
//        }
//        return true;
//    }
//
//    public Boolean verifyCode(VerifyCodeRequest request) {
//        UserInfoExample example = new UserInfoExample();
//        example.createCriteria().andEmailEqualTo(request.getEmail()).andIsDeleteEqualTo(IsDelete.N);
//        if (userInfoMapper.countByExample(example) <= 0) {
//            return false;
//        }
//        Jedis jedis = new Jedis();
//        String code = jedis.get(request.getEmail());
//        if (code != null && code.equals(request.getCode())) {
//            UserInfo userInfo = userInfoMapper.selectByExample(example).get(0);
//            User user = new User();
//            user.setPassword(request.getPassword());
//            UserExample example1 = new UserExample();
//            example1.createCriteria().andUserIdEqualTo(userInfo.getUserId());
//            userMapper.updateByExampleSelective(user, example1);
//        }
//        return true;
//    }

    private String htmlTemplate(String code) {
        return "<html>\n" +
            "<body>\n" +
            "<div style=\"background-color: blue; margin：auto; text-align:center\">" +
            code +
            "</div>\n" +
            "</body>\n" +
            "</html>";
    }
}
