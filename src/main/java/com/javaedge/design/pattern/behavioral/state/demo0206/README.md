# 状态模式 (State Pattern) - Demo0206

## 概述
状态模式允许一个对象在其内部状态改变时改变它的行为。该对象看起来好像修改了它的类。

## UML 类图
本案例实现了以下结构：
- **State** (状态接口): 定义了一个接口以封装与Context的一个特定状态相关的行为
- **Context** (上下文类): 维护一个State实例，这个实例定义当前的状态
- **StartState** (启动状态): State接口的具体实现，表示启动状态
- **StopState** (停止状态): State接口的具体实现，表示停止状态
- **StatePatternDemo** (演示类): 客户端，演示状态模式的使用

## 类说明

### State.java
状态接口，定义了`doAction(Context context)`方法。

### Context.java
上下文类，包含一个State对象，通过setState方法可以改变当前状态。

### StartState.java
具体状态类，表示"启动"状态。

### StopState.java
具体状态类，表示"停止"状态。

### StatePatternDemo.java
演示类，展示如何使用状态模式在不同状态之间切换。

## 运行方式
```bash
cd /Users/javaedge/soft/IDEAProjects/Java-DesignPatterns-Tuitorial/src/main/java
javac com/javaedge/design/pattern/behavioral/state/demo0206/*.java
java com.javaedge.design.pattern.behavioral.state.demo0206.StatePatternDemo
```

## 预期输出
```
Player is in start state
Current State: Start State
Player is in stop state
Current State: Stop State
```

## 适用场景
1. 对象的行为随着状态的改变而改变
2. 代码中包含大量与对象状态有关的条件语句
3. 状态转换的规则比较复杂

## 优点
- 封装了状态转换规则
- 将所有与某个状态有关的行为放到一个类中
- 易于增加新的状态
- 使状态转换显式化

## 缺点
- 增加了系统类和对象的个数
- 状态模式的结构与实现都较为复杂
- 对"开闭原则"的支持不太好

