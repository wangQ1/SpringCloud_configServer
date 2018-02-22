package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * To run your own server use the 'spring-cloud-config-server' dependency and '@EnableConfigServer' annotation.
 * 所有springcloud配置中心的配置文件，都由以下几种格式组成
 * 1 Application(配置文件是属于那个应用的)
 * 2 porfile(配置文件属于那个阶段 ：开发阶段，测试阶段，产品阶段)
 * 3 label 在git仓库中的那个分支
 * 
 * @author Administrator
 *
 */
@EnableConfigServer//启用分布式配置中心，从远程git仓库中获取配置
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
