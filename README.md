# spring-cloud-contract

### === Link PPT JUnit & Spring Cloud Contract ===

https://docs.google.com/presentation/d/15XMYSZQCQ26DirE9QEeCH_mZA-R3YlXL50fe0Ma-E1g/edit?usp=share_link

### === Link SonarQube dan SonarLint ===

https://docs.google.com/presentation/d/1g84Zt2wsqi1QFJYM7hM8U8tNoo-m8mAevK_2ayLeKPM/edit?usp=share_link

### === Link Devops Jenkins Pipeline ===

https://docs.google.com/presentation/d/1cnyIOYeH898JTBeY8VyJmNbmu4CpUDrdszq7lYGgupM/edit?usp=share_link

### === Link Recording ===
https://drive.google.com/file/d/1XcnQ8EV8b0EhOZY7y5Skl6L8H1OBZdyH/view?usp=sharing

### ~ Tugas soal membuat sebuah Service ~

### 1 (users-service)
tb_users
- userId INTEGER (primary key)
- name VARCHAR
- phone VARCHAR
- email VARCHAR
- address VARCHAR 

### 2 (product-service)
tb_product
- productId INTEGER (primary key)
- productName VARCHAR
- price DECIMAL
- description VARCHAR

### 3 (order-service)
tb_order
- orderId INTEGER (primary key)
- productId INTEGER
- count(jumlah beli) DECIMAL
- amount(jumlah harga) DECIMAL 

### 4 (checkout-service)
tb_checkout
- checkoutId INTEGER
- orderId INTEGER
- userId INTEGER
- status BOOLEAN
- orderDate DATETIME

##### Note : 
##### 1. membuat sebuah service menggunakan spring boot.
##### 2. setiap service nya terdiri dari 1 table
##### 3. membuat controller terdiri dari POST dan GET dari service yang di buat(POST insert ke database H2 dan GET untuk menampilkan datanya) dan buatkan testingnya baik POST maupun GET menggunakan spring-cloud-contract.


