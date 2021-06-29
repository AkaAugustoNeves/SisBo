import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ObitoComponent } from './obito/obito.component';

const routes: Routes = [
  {path: 'obito', component: ObitoComponent},
  { path: '**', redirectTo: 'obito' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
