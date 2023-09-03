import axios from 'axios'

const PRODUCT_API_BASE_URL = "http://localhost:8080/api/product?pageNo=0&pageSize=12"

class ProductService {

    getProducts() {
        return axios.get(PRODUCT_API_BASE_URL);
    }

}

export default new ProductService()