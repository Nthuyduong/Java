import {Component,Input} from "@angular/core";
import {IStudent} from "../../interfaces/student.interface";
@Component({
  selector: 'home',
  templateUrl: './home.component.html'
})
export class HomeComponent extends Component{
  //khai bao bien//
  //ten bien: kieu du lieu =  gia tri//
  //IStudent co kieu du lieu laf student//
  student: IStudent = {id:1,name:'Nam',age:18,address:'8 Ton That Thuyet'};

  //Khai bao mot mang so trong ts//
  arrayNumber: number[] = [1,2,3,4,5]

  stringArray: string[] = ["Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"];

  ls: IStudent [] = [
    {id:1, name: "Nguyễn Văn A", age:19, address:'So 8 Ton That Thuyet'},
    {id:2, name: "Nguyễn Văn B", age:21, address:'So 8 Ton That Thuyet'},
    {id:3, name: "Nguyễn Văn C", age:19, address:'So 8 Ton That Thuyet'}
  ]
}
