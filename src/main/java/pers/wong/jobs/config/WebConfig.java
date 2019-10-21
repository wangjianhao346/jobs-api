package pers.wong.jobs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Resource
    private FileConfig fileConfig;

    //在F:/SpringBootFiles/Image/下如果有一张 luffy.jpg.jpg的图片，那么：
    // 1 访问：http://localhost:8080/imgs/Excalibar.jpg 可以访问到
    // 2 html 中 <img src="http://localhost:8080/img/luffy.jpg">
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**").addResourceLocations("file:" + fileConfig.getPath() + "/pic/");
        registry.addResourceHandler("/avatar/**").addResourceLocations("file:" + fileConfig.getPath() + "/avatar/");
        registry.addResourceHandler("/cover/**").addResourceLocations("file:" + fileConfig.getPath() + "/cover/");
        registry.addResourceHandler("/video/**").addResourceLocations("file:" + fileConfig.getPath() + "/video/");
        registry.addResourceHandler("/icon/**").addResourceLocations("file:" + fileConfig.getPath() + "/icon/");
    }
}
