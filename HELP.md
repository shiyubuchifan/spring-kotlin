## 1.自定义 Banner
启动时打印的Banner可以通过在 classpath 中添加 banner.txt 文件或通过将 spring.banner.location 属性设置为该文件的位置来自定义。 如果该文件的编码不是UTF-8，你可以通过 spring.banner.charset 属性设置其字符编码。

在你的 banner.txt 文件中，你可以使用 Environment 中的任何key，以及以下任何占位符。

Table 1. Banner variables
变量	介绍
${application.version}

你的应用程序的版本号，也就是 MANIFEST.MF 中声明的。 例如，Implementation-Version: 1.0 被打印为 1.0。

${application.formatted-version}

你的应用程序的版本号，如在`MANIFEST.MF`中声明的那样，并以格式化显示（用括号包围，以 v 为前缀）。 例如 (v1.0)。

${spring-boot.version}

你所使用的Spring Boot版本。 例如 3.2.0-SNAPSHOT 。

${spring-boot.formatted-version}

你正在使用的Spring Boot版本，格式化显示（用大括号包围并以 v 为前缀）。 例如 (v3.2.0-SNAPSHOT)。

${Ansi.NAME} (或 ${AnsiColor.NAME}, ${AnsiBackground.NAME}, ${AnsiStyle.NAME})

其中 NAME 是一个ANSI转义代码的名称。 详见 AnsiPropertySource 。

${application.title}

你的应用程序的标题，正如在 MANIFEST.MF 中声明的那样。 例如， Implementation-Title: MyApp 被打印成 MyApp。