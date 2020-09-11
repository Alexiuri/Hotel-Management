import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { RouterModule } from '@angular/router';
import { ButtonModule } from 'primeng/button';

@NgModule({
  declarations: [MainMenuComponent],
  imports: [
    CommonModule,
    RouterModule,
    ButtonModule
  ],
  exports:[
    MainMenuComponent
  ]
})
export class SharedModule { }
