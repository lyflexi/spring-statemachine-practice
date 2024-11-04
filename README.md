# spring-statemachine-practice
spring状态机实践

# 区分状态模式与责任链模式
从定义来看，状态模式强调的是一个对象内在状态的改变，而责任链模式强调的是外部节点对象间的改变。

从其代码实现上来看，状态模式各个状态对象知道自己下一个要进入的状态对象，而责任链模式并不清楚其下一个节点处理对象，因为链式组装由客户端负责。