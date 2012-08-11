package org.ocpsoft.prettyfaces.annotation.basic.regex;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.ocpsoft.prettyfaces.annotation.ForwardTo;
import org.ocpsoft.prettyfaces.annotation.ParameterBinding;
import org.ocpsoft.prettyfaces.annotation.URLPattern;
import org.ocpsoft.prettyfaces.annotation.ValidateRegExp;

@ManagedBean
@RequestScoped
@URLPattern("/check/{value}")
@ForwardTo("/faces/validate-regexp.xhtml")
public class ValidateRegExpBean
{

   @ParameterBinding
   @ValidateRegExp("[a-z]{2}")
   private String value;

   public String getValue()
   {
      return value;
   }

   public void setValue(String value)
   {
      this.value = value;
   }

}