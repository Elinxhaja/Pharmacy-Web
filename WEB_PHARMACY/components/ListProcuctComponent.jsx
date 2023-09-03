import React, { Component } from 'react';
import ProductService from '../services/ProductService';


class ListProductComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            products: []
        }
    }
    componentDidMount(){
        ProductService.getProducts().then((res)=>{
            this.setState({products: res.data});

        });
    }
    render() {
        return (
            <div>
                <h2 className="text-center">Products List</h2>
                <div className= "row">
                    <table className= "table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>Product name</th>
                                <th>Product description</th>
                                <th>Product price</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.products.map(
                                    product => 
                                    <tr key = {product.id}>
                                        <td>{product.name}</td>
                                        <td>{product.description}</td>
                                        <td>{product.price}</td>
                                    
                                    </tr>
                                )
                            }
                

                        </tbody>



                    </table>

                </div>
            </div>
        );
    }
}

export default ListProductComponent;