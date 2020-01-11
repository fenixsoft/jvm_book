# 《深入理解Java虚拟机（第3版）》
　　本工程为《深入理解Java虚拟机（第3版）》书中的样例代码，以方便读者自行测试。部分代码需要在特定的虚拟机版本、参数下运行，在代码前均已“VM Args”的注释进行标注。

　　书中的勘误也会在本文中持续更新，读者可通过issues提交新的勘误，如对新版有任何建议，也欢迎以任何其他形式提出。

#### 勘误列表：

- **Page 27**：到了JDK 10，HotSpot又重构了Java虚拟机的垃圾收集器接口 （Java Virtual Machine 【Compiler】 Interface）
  <br>更正：到了JDK 10，HotSpot又重构了Java虚拟机的垃圾收集器接口 （Java Virtual Machine 【Garbage】 Interface）
- **Page 238**：13: iload_1 后的注释应该是字节码第14行的，即
  >   13:  iload_1   // 保存x到returnValue中，此时x=2  
  >   14:  istore  4  

  改为：
  >   13:  iload_1    
  >   14:  istore  4  // 保存x到returnValue中，此时x=2
- **Page 259**：13 astore_3 后注释Taget是笔误，应为Target
- **Page 265/266**：在266页正文中出现两次注释一，其中第一个注释是265页才对，应该是排版问题，请编辑再版时注意。
- **Page 290**：用在IntelliJ 【IDE】、Eclipse这些IDE上做HotSwap……
 <br>更正：
 用在IntelliJ 【IDEA】、Eclipse这些IDE上做HotSwap……
- **Page 312**：代码实例中出现三处【gay】，譬如Father gay = new Son(); 均应为【guy】，这个不影响代码运行，只是不太雅观。
- **Page 317**：产生这种差别产生的根本原因是Java语言在编译期间【却】已将println(String)方法完整的符号引用。
 <br>更正：产生这种差别产生的根本原因是Java语言在编译期间【就】已将println(String)方法完整的符号引用。
  
#### 以下勘误内容已在第1次重印版（2019-12-27日）修正
------
- **前言部分**：读者反馈信箱：understandjvm@gmail.com 
  <br>更正：由于这个信箱由于一直只收未发，刚印刷后收到Google的通知此账号已自动作废。而且根据Google规定，作废后无法注册同名邮箱。下次重印将修改为本工程地址:https://github.com/fenixsoft/jvm_book。
- **Page 9**：支持HTTP 2客户【单】API等91个JEP
  <br>更正：支持HTTP 2客户【端】API等91个JEP
- **Page 64**：在【代码清单2-8】里笔者借助了CGLib……
  <br>更正：在【代码清单2-9】里笔者借助了CGLib……
- **Page 368**: 【ArrayList&lt;int&gt;】与ArrayList&lt;String&gt;其实是同一个类型
  <br>更正：【ArrayList&lt;Integer&gt;】与ArrayList&lt;String&gt;其实是同一个类型
