# APIGETWAY,REDIS,JWT
## REDIS
[![(http://localhost:8081/api/book)](http://localhost:8081/api/book)](http://localhost:8081/api/book)
- Tăng tốc độ get dữ liệu khi sử dụng redis
![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/1ffb28f8-133c-4cf2-b327-84675902c309)
## JWT

## APIGETWAY
- Dùng APIGETWAY gọi dịch vụ Book http://localhost:8084/getBooks
![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/23298b66-bae5-4ba4-b655-fc0835b4f4ae)
 - Gọi dịch vụ Login từ http://localhost:8084/login
![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/5d23db02-6e9b-4df9-b1f7-3ea252fb68f1)
- Người dùng thêm Book không quyền
  ![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/bb362a7f-2376-4a8f-8b1b-8db7dcc41579)
- Quyền ADMIN mới có thể thêm Book (username:admin được gán role ADMIN)
```java
  //Thêm book với quyền ADMIN
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @PostMapping("/addBook")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        ResponseEntity<String> response = restTemplate.postForEntity(bookApiUrl, book, String.class);
        return response;
    }
```
  ![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/b9fc16a7-9e0a-43bd-b9ca-562699fd20c6)
  ![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/c96c1efa-c299-47e4-a1f4-ea4bc56df573)
  ![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/48cb8f8a-bf3d-404b-950b-65a11ba19ab7)
-Tương tự nếu đăng nhập với quyền USER_READ không thể thêm sản phẩm (lỗi 403)
![image](https://github.com/chicuongdev2002/Service_JWT_Redis/assets/124854803/601c4799-f56b-4fa3-ad3a-94312b2d6f07)




