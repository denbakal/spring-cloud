1) POST /users
{"firstName": "Mike", "lastName": "Wisdom", "email": "m.wisdom@gmail.com", "age": 29}
2) POST /providers
{"name": "UMC", "code": 1234}
3) POST /products
{"productType": "MOBILE_OPERATORS", "name": "UMC refill", "provider": {"id": "5c039d42c728b42df579d07e"}}
4) POST /orders
{
    "userDto": {"firstName": "Mike", "lastName": "Wisdom", "email": "m.wisdom@gmail.com", "age": 29}, 
    "productDto": {"productType": "MOBILE_OPERATORS", "name": "UMC refill", "provider": {"name": "UMC", "code": 1234}},
    "amount": 100
}
5) POST /payments
{"orderId": "123", "userId": "123", "amount": 1200, "state": "PROCESSING"}

