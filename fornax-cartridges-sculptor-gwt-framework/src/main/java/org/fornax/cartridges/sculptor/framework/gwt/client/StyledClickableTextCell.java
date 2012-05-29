package org.fornax.cartridges.sculptor.framework.gwt.client;

import com.google.gwt.cell.client.ClickableTextCell;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class StyledClickableTextCell extends ClickableTextCell {

    String style;   
    public StyledClickableTextCell()
    {
        super();
        style = "linkTextStyle";
    }


     @Override
      protected void render(Context context, SafeHtml value, SafeHtmlBuilder sb) {
        if (value != null) {
          sb.appendHtmlConstant("<div class=\""+style+"\">");
          sb.append(value);
          sb.appendHtmlConstant("</div>");
        }
      }

     public void addStyleName(String style)
     {
         this.style = style; 
     }

}
