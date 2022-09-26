import {Component, Input} from "@angular/core";

@Component({
  /*ten*/
  selector: 'app-student',
  /*dia chi lay du lieu*/
  templateUrl: './student.component.html'
})
/*tao ra mot component co class la*/
export class StudentComponent extends Component{
  @Input()
  stName ?: string;
}
