import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {StudentComponent} from "./student/student.component";
import {ClassComponent} from "./class/class.component";
import {FormsModule} from "@angular/forms";
import {HomeComponent} from "./pages/home/home.component";
import {LoginComponent} from "./pages/login/login.component";
import {RouterModule, Routes} from "@angular/router";
import {AboutComponent} from "./pages/about/about.component";
import {ContactComponent} from "./pages/contact/contact.component";
import {FoodComponent} from "./pages/food/food.component"
import {HttpClientModule} from "@angular/common/http";

//Khai bao cac page trong website//
//mang chua cac link de chi dinh//
const appRoutes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'about', component: AboutComponent},
  {path: 'contact', component: ContactComponent},
  {path: 'food', component: FoodComponent}
]

@NgModule({
  declarations: [
    AppComponent, StudentComponent, ClassComponent, HomeComponent, LoginComponent, AboutComponent, ContactComponent, FoodComponent
  ],
  imports: [
    BrowserModule, FormsModule, RouterModule.forRoot(appRoutes), HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
