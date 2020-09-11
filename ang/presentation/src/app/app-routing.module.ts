import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminPageComponent } from './admin/admin-page/admin-page.component';
import { MainPageComponent } from './pages/main-page/main-page.component';

const routes: Routes = [
    { path: '', redirectTo: '/main_page', pathMatch: 'full'},
    { path: 'main_page', component: MainPageComponent},
    { path: 'admin', component: AdminPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
