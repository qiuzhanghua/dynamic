# dynamic

动态连接不同的数据库

## Package

```bash
mvn package
```
## Run
```bash
java -Dsso.db=pgsql -jar target/dynamic-1.0.0-SNAPSHOT-runner.jar
java -Dsso.db=mysql -jar target/dynamic-1.0.0-SNAPSHOT-runner.jar
```

## TODO
处理不同数据库的连接信息，如用户名、密码等。
