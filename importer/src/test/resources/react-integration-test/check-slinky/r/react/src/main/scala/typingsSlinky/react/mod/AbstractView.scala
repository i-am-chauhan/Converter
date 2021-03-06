package typingsSlinky.react.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.StyleMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Browser Interfaces
// https://github.com/nikeee/2048-typescript/blob/master/2048/js/touch.d.ts
// ----------------------------------------------------------------------
@js.native
trait AbstractView extends js.Object {
  var document: Document = js.native
  var styleMedia: StyleMedia = js.native
}

object AbstractView {
  @scala.inline
  def apply(document: Document, styleMedia: StyleMedia): AbstractView = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], styleMedia = styleMedia.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractView]
  }
}

