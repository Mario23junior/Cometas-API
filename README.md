 # Api de listagem de Cometas

API REST de código aberto para dados de consulta de  pesquisa  as informações nela contida  foi desenvolvida usando como base nos dados da <a href="https://www.nasa.gov/subject/6893/nebulae/" target="_blank">NASA</a>
 e <a href="https://chandra.harvard.edu/photo/2007/orion/"></a> usando como base organizacional um sistema de CRUD
<p align="center">

## Primeiro execute o mave
```bash
 mvn package
```

## Em seguida faça compile o projeto

```
java -jar target/ApiNebulosa-API-1.0-SNAPSHOT.jar
```

# Para obter mais detalhes da documentação acesso o swagger
```
http://localhost:8080/swagger-ui.html
```
# uso

## acesse a url de cadastro
```
http://localhost:8080/api/v1/user
```
## Obtendo resultado
```
http://localhost:8080/v1/api/listAll
```

## Resultado dos dados da API
```
```


# Contribuindo
Solicitações pull são bem-vindas. Para mudanças importantes, abra um problema primeiro para discutir o que você gostaria de mudar.

Certifique-se de atualizar os testes conforme apropriado

## License
[MIT](https://choosealicense.com/licenses/mit/)
