import { Utilisateur } from './../../model/utilisateur.model';
import { Observable } from 'rxjs';
import { UtilisateurLogin } from './../../model/utilisateur-login.model';
import { UtilisateurLoginService } from './../../service/utilisateur-login.service';
import { UtilisateurService } from './../../service/utilisateur.service';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form-inscription',
  templateUrl: './form-inscription.component.html',
  styleUrls: ['./form-inscription.component.css']
})
export class FormInscriptionComponent implements OnInit {

  formUtilisateur!: FormGroup
  utilisateurLogin$!: Observable<UtilisateurLogin>
  utilisateurLogin!: UtilisateurLogin
  utilisateur$!: Observable<Utilisateur>
  utilisateur!: Utilisateur
  login!: string
  password!: string

  constructor(private formBuilder: FormBuilder, private router: Router, private utilisateurService: UtilisateurService, private utilisateurLoginService: UtilisateurLoginService) { }

  ngOnInit(): void {
    this.formUtilisateur = this.formBuilder.group({
      _nom: [null, [Validators.required]],
      _prenom: [null, [Validators.required]],
      _dateNaissance: [null],
      _email: [null],
      // _login: [null],
      // _password: [null]
    })
  }

  onSubmit() {
    this.utilisateur = new Utilisateur()
    this.utilisateur = this.formUtilisateur.value
    this.utilisateurLogin = new UtilisateurLogin()
    this.utilisateurLogin._login = this.login
    this.utilisateurLogin._password = this.password
    this.utilisateurLogin._role = "USER"
    this.utilisateur._utilisateurLogin = this.utilisateurLogin
    this.utilisateur$ = this.utilisateurService.save(this.utilisateur)
    this.utilisateur$.subscribe(data => console.log(data))
    this.router.navigateByUrl("accueil")
  }
}
