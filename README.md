<center><h1>MongoDB - Docker Compose</h1></center>

Modern bir Spring Boot uygulaması olarak tasarlanmış ve MongoDB veritabanını kullanarak bir RESTful API sunan bir uygulamayı hedeflemektedir. Bu projenin amacı, bir kullanıcı veritabanı üzerinde temel CRUD (Create, Read, Update, Delete) işlemleri sağlayan ve bu işlemlere HTTP istekleri ile erişim sağlayan bir RESTful API oluşturmaktır.


<h3>Proje Hedefleri:</h3>

Kullanıcılar için temel işlemleri (kullanıcı ekleme, okuma, güncelleme, silme) sağlayan RESTful bir API sunmak.
Kullanıcı verilerini MongoDB veritabanında saklamak ve yönetmek.
Spring Boot, Spring Data MongoDB ve Spring Web teknolojilerini kullanarak uygulamanın geliştirilmesi.
Uygulamanın uygun bir veri modeli (User) üzerinde çalışmasını sağlamak.
Projenin geliştirilmesi ve çalıştırılmasının kolay olmasını sağlamak için Docker ve Docker Compose kullanımı.


<h3>Proje Özellikleri:</h3>

- RESTful API: Kullanıcıların eklenmesi, okunması, güncellenmesi ve silinmesini sağlayan bir dizi API noktası.
- MongoDB Veritabanı: Kullanıcı verilerinin saklandığı veritabanı olarak MongoDB'nin kullanılması.
- Spring Boot: Proje, Spring Boot'un kolaylığı ve hızıyla geliştirilmiştir.
- Spring Data MongoDB: MongoDB veritabanına erişimi yönetmek için Spring Data MongoDB kullanımı.
- Docker Desteği: Projeyi Docker kullanarak hızlı ve tekrarlanabilir bir şekilde başlatma ve çalıştırma desteği.

[Neden MongoDB ve Docker Compose kullandık?](https://github.com/ZU1234/MongoDB-Docker-Compose/blob/main/why.md)

<h3>Proje Başlatma:</h3>

- Proje dizininde Docker Compose dosyasını kullanarak MongoDB sunucusunu başlatın.

- Spring Boot uygulamasını başlatın ve RESTful API'yi kullanarak kullanıcı verileri üzerinde işlem yapın. (Postman)

Bu projenin temel amacı, Spring Boot ve MongoDB kullanarak bir RESTful API uygulaması oluşturmak ve kullanıcı verilerini etkili bir şekilde yönetmektir. Projeyi inceleyerek, Spring Boot ve MongoDB teknolojilerini bir arada nasıl kullanabileceğinizi daha iyi anlayabilirsiniz.




<h3>Docker Compose Kullanımı:</h3>

Proje dizininde bulunan Docker Compose dosyasını kullanarak MongoDB sunucusunu başlatmak oldukça kolaydır. Bu, projenin geliştirilmesi ve çalıştırılmasını kolaylaştırır ve aynı ortamı kullanmanızı sağlar.

**Adım 1:** Docker Compose Kurulumu

Eğer henüz Docker Compose yüklü değilse, aşağıdaki komutları kullanarak Docker Compose'i kurun:

```bash
sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
```
***Not:*** Eğer Linux kullanıyorsanız ve Docker Compose kurulu değilse yukarıdaki komutları kullanmalısınız.

**Adım 2:** MongoDB Sunucusunu Başlatma

Proje dizinindeki Docker Compose dosyasını kullanarak MongoDB sunucusunu başlatın. Bu, projenin MongoDB veritabanını hızlı ve tekrarlanabilir bir şekilde başlatmanıza olanak tanır. Aşağıdaki komutu kullanarak MongoDB'yi başlatabilirsiniz (Docker Compose dosya yolunu düzelttiğinizden emin olun):
```bash
sudo docker-compose -f /path/to/docker-compose.yml up -d
```
**Adım 3:** Konteyner Durumunu Kontrol Etme

MongoDB konteynerinin durumunu görmek için aşağıdaki komutu kullanabilirsiniz:

```bash
sudo docker-compose -f /path/to/docker-compose.yml ps -a
```

Bu adımları takip ederek, projenizin içindeki Docker Compose dosyasıyla belirtilen yapılandırmalara uygun olarak MongoDB'nin bir Docker konteynerinde başlatıldığını göreceksiniz. Docker Compose kullanarak projenizi daha hızlı başlatmak ve yönetmek mümkün olacak.



## Kullanılan Teknolojiler

Bu proje, aşağıdaki teknolojileri kullanmaktadır:

- **Spring Boot**: Modern ve hızlı bir Java framework'üdür. Web uygulamalarını geliştirmek için kullanılmıştır.
- **Spring Data MongoDB**: MongoDB veritabanına erişimi kolaylaştıran Spring modülüdür. Veritabanı işlemleri için kullanılmıştır.
- **Spring Web**: Web tabanlı uygulamalar geliştirmek için Spring tarafından sağlanan modüldür. API'leri oluşturmak için kullanılmıştır.
- **MongoDB**: NoSQL veritabanıdır. Kullanıcı verilerini saklamak ve yönetmek için kullanılmıştır.
- **Docker**: Konteynerleştirme platformudur. Projeyi izole bir ortamda çalıştırmak için kullanılmıştır.
- **Docker Compose**: Çoklu konteyner uygulamalarını yönetmek için kullanılır. MongoDB ve projenin diğer bileşenlerini bir arada başlatmak için kullanılmıştır.

Bu projede Java 11 kullanılmıştır.

Bu teknolojiler projenin etkili bir şekilde geliştirilmesi, çalıştırılması ve yönetilmesini sağlar.
<center><p><img src="https://raw.githubusercontent.com/github/explore/master/topics/java/java.png" width="100" height="100">
&nbsp;&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/github/explore/master/topics/spring-boot/spring-boot.png" width="100" height="100">
&nbsp;&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/github/explore/master/topics/mongodb/mongodb.png" width="100" height="100">
&nbsp;&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/github/explore/master/topics/docker/docker.png" width="100" height="100">
&nbsp;&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/github/explore/master/topics/docker-compose/docker-compose.png" width="100" height="100"></p></center>
