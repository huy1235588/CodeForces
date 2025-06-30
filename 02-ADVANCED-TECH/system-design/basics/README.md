# System Design Basics

## Core Concepts

### 1. Scalability
- **Horizontal Scaling**: Thêm máy chủ (scale out)
- **Vertical Scaling**: Nâng cấp phần cứng (scale up)

### 2. Reliability
- System hoạt động đúng ngay cả khi có lỗi
- Fault tolerance và redundancy
- Backup và disaster recovery

### 3. Availability
- Uptime percentage (99.9%, 99.99%, 99.999%)
- Load balancing
- Health checks

### 4. Consistency
- Strong consistency vs Eventual consistency
- ACID properties
- CAP theorem

### 5. Performance
- Latency vs Throughput
- Response time optimization
- Resource utilization

## Basic Architecture Patterns

### Load Balancer
```
Client → Load Balancer → [Server 1, Server 2, Server 3]
```

### Database Replication
```
Application → Master DB → Slave DB 1
                      → Slave DB 2
```

### Caching Layer
```
Client → Application → Cache → Database
```

## Common Technologies
- **Load Balancers**: Nginx, HAProxy, AWS ELB
- **Databases**: MySQL, PostgreSQL, MongoDB
- **Caching**: Redis, Memcached
- **Message Queues**: RabbitMQ, Apache Kafka
