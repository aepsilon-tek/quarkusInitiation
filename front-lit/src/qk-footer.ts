/**
 * @license
 * Copyright 2019 Google LLC
 * SPDX-License-Identifier: BSD-3-Clause
 */

 import {LitElement, html, css} from 'lit';
import {customElement, property} from 'lit/decorators.js';

/**
 * Footer COmponent
 *
 */
@customElement('qk-footer')
export class QkFooter extends LitElement {


  static override styles = css`
    :host {
      display: block;
      border: solid 1px green;
      padding: 16px;
      max-width: 800px;
    }
  `;

  override render() {
    return html`
      Aepsilon Copyright
    `;
  }


}


//https://lit.dev/docs/components/defining/
//Providing good TypeScript typings
declare global {
  interface HTMLElementTagNameMap {
    'qk-footer': QkFooter;
  }
}
