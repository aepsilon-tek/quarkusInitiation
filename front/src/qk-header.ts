/**
 * @license
 * Copyright 2019 Google LLC
 * SPDX-License-Identifier: BSD-3-Clause
 */

 import {LitElement, html, css} from 'lit';
import {customElement, property} from 'lit/decorators.js';

/**
 * Header COmponent
 *
 */
@customElement('qk-header')
export class QkHeader extends LitElement {


  static override styles = css`
    :host {
      display: block;
      border: solid 1px blueviolet;
      padding: 16px;
      max-width: 800px;
    }
  `;

  override render() {
    return html`
      Welcome to Beer App
    `;
  }


}


//https://lit.dev/docs/components/defining/
//Providing good TypeScript typings
declare global {
  interface HTMLElementTagNameMap {
    'qk-header': QkHeader;
  }
}
