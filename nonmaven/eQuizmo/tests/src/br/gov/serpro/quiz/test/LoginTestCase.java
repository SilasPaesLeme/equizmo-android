package br.gov.serpro.quiz.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.EditText;
import android.widget.ImageButton;
import br.gov.serpro.quiz.view.activity.LoginActivity;

public class LoginTestCase extends ActivityInstrumentationTestCase2<LoginActivity> {
	private EditText name;
	private EditText email;
	private ImageButton buttonLogin;

	public LoginTestCase() {
		super(LoginActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@MediumTest
	public void testLogin() throws Exception {
		getActivity();
//		name = (EditText) getActivity().findViewById(R.id.login_edittext_nome);
//		email = (EditText) getActivity().findViewById(R.id.login_edittext_email);
//		buttonLogin = (ImageButton) getActivity().findViewById(R.id.login_button_entrar);
		
	}

}
