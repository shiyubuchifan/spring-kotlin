package cn.snow.springkotlindemo

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.env.Environment
import java.io.PrintStream

@SpringBootApplication
class SpringKotlinDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinDemoApplication>(*args) {
        val banner: Banner = MyBanner()
        setBanner(banner)
    }


}

class MyBanner : Banner {
    override fun printBanner(environment: Environment?, sourceClass: Class<*>?, out: PrintStream?) {
        System.out.println("************************************");
        System.out.println("*                                  *");
        System.out.println("*   Welcome to My Spring Boot App! *");
        System.out.println("*                                  *");
        System.out.println("************************************");
    }
}
