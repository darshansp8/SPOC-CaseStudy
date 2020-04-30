import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RequestsComponent } from './requests/requests.component';
import { ViewRequestsComponent } from './view-requests/view-requests.component';


const routes: Routes = [
  {path: '', redirectTo: 'pendingrequests', pathMatch: 'full'},
  {path: "pendingrequests", component: RequestsComponent},
  {path: "viewrequest/:id", component: ViewRequestsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
