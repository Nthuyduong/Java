import {Component, Input} from "@angular/core";

@Component({
  /*ten*/
  selector: 'app-class',
  /*dia chi lay du lieu*/
  templateUrl: './class.component.html'
})
/*tao ra mot component co class la*/
export class ClassComponent extends Component{
  classroomName = 'T2207E';
  numberStudents = 27;

  /*viet ham tang so luong*/
  upNumber(){
    this.numberStudents++;
  }

  studentName1 = 'Nguyen Van An'
  studentName2 = 'Nguyen Van B'
  studentName3 = 'Nguyen Van C'
  /*truyen du lieu*/
  @Input()
  stClass ?: string;
}
