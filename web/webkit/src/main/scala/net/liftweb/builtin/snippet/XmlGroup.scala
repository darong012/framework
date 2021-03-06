/*
 * Copyright 2009-2011 WorldWide Conferencing, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.liftweb
package builtin
package snippet

import scala.xml._
import net.liftweb.http._

object XmlGroup extends DispatchSnippet {

  def dispatch : DispatchIt = {
    case _ => render _
  }

  /**
   * Returns the child nodes:
   *
   * <pre name="code" class="xml">
   *   &lt;lift:XmlGroup>
   *     &lt;div class="lift:MySnippet">
   *     &lt;/div>
   *     &lt;div class="lift:MyOtherSnippet">
   *     &lt;/div>
   *  &lt;/lift>
   * </pre>
   */
  def render(kids: NodeSeq): NodeSeq = kids
}

