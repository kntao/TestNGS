package org.example.cases;

/**
 * Created by qingtao.kong on 2020/11/5.
 */
public class BaiduTest {
    WebDriver driver;//new FirefoxDriver();

    @BeforeClass
    public void setup()
    {
        //讲谷歌驱动拷贝到项目下
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        //driver.manage().window().maximize();
    }
    @Test
    public void test1()
    {
        //输入selenium查询
        driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("百度");
        //点击百度一下
        driver.findElement(By.xpath(".//*[@id='su']")).click();
        System.out.println("测试用例1");
    }
    @Test
    public void test2()
    {
        System.out.println("测试用例2");
    }
    @AfterClass
    public void closed()
    {
        //关闭浏览器
        driver.quit();
        System.out.println("关闭浏览器成功");
    }
}
