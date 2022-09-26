import {Component,Input} from "@angular/core";
import {IStudent} from "../../interfaces/student.interface";
import {ICart, IFoodCart, IFoodMenu, IMenu} from "../../interfaces/foodmenu.interfaces";
import {HttpClient} from "@angular/common/http";
@Component({
  selector: 'food',
  templateUrl: './food.component.html'
})
export class FoodComponent{
  data: IMenu[] = [];
  cart: ICart[]=[];

  //tim cach lay du lieu tu api chp vao bien data//
  constructor(private http: HttpClient) {
  }
   //ham nay tu dong chay khi print giao dien ra//
  ngOnInit(){
    const url = 'https://foodgroup.herokuapp.com/api/menu';
    this.http.get<IFoodMenu>(url).subscribe(data1 =>{
      this.data = data1.data;
    });
    const http = 'https://foodgroup.herokuapp.com/api/today-special';
    this.http.get<IFoodCart>(http).subscribe(data2 =>{
      this.cart = data2.data;
    });
  }

}
