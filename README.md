# Redis Homework

## Proje Hakkında

Bu projede Docker kullanılarak Redis ve RedisInsight kurulumu gerçekleştirildi. Java uygulaması ile Redis veritabanına bağlanılarak 10.000 adet Person nesnesi oluşturuldu, Redis'e kaydedildi ve RedisInsight üzerinden doğrulandı.

## Kullanılan Teknolojiler

- Java
- Maven
- Redis
- RedisInsight
- Docker
- Jedis
- Gson

## Projede Yapılanlar

- Docker üzerinde Redis container'ı çalıştırıldı.
- RedisInsight ile Redis veritabanına bağlantı sağlandı.
- Java kullanılarak Redis'e bağlantı kuruldu.
- 10.000 adet Person nesnesi Redis'e eklendi.
- Eklenen veriler RedisInsight üzerinden görüntülenerek kontrol edildi.

## Proje Yapısı

- **Person.java:** Person nesnesini temsil eden sınıf.
- **RedisApplication.java:** Redis bağlantısını kuran, verileri ekleyen ve okuyan ana sınıf.