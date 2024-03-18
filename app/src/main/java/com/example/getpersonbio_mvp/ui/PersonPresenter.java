package com.example.getpersonbio_mvp.ui;

import com.example.getpersonbio_mvp.Model.PersonModel;

public class PersonPresenter {
    PersonView view;

    public PersonPresenter(PersonView view) {
        this.view = view;
    }

    public PersonModel getPersonFromModel() {
        return new PersonModel("sara", "sara is a graphic designer known for her creative designs", 27, 321);
    }

    public void getPersonBio() {
        view.onGetPersonBio(getPersonFromModel().getBio());
    }
}
