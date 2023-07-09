import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  registerForm:any = FormGroup;
  submitted = false;

  constructor( private formBuilder: FormBuilder){}

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required]]
    });
  }
  
  get f() { 
    return this.registerForm.controls; 
  }

  onSubmit() {
  }
  

}
