import resolve from '@rollup/plugin-node-resolve';
import commonjs from '@rollup/plugin-commonjs';
import { terser } from 'rollup-plugin-terser';
import typescript from '@rollup/plugin-typescript';
import { babel } from '@rollup/plugin-babel'
import postcss from 'rollup-plugin-postcss' // import postcss plugin  

// `npm run build` -> `production` is true
// `npm run dev` -> `production` is false
const production = !process.env.ROLLUP_WATCH;

const iife = {
  input: 'src/qk-main-page.ts',
  output: {
    file: 'public/bundle.iife.min.js',
    format: 'iife',
    // les modules iife doivent être nommés afin de pouvoir y faire référence depuis d'autres modules
    name: 'quarkusApp',
    sourcemap: true
  },
  plugins: [
    typescript({
      include: ['src/**/*.ts']
    }),
    resolve(), // prise en charge des modules depuis node_modules
    commonjs(),// prise en charge de require
    postcss(), // use postcss plugin
    babel({
      babelHelpers: 'bundled',
      exclude: "node_modules/**"
    }), // transpilation
    production && terser({ format: { comments: false } }), // minify, but only  in production
 ]
};

const esm = {
  input: 'src/qk-main-page.ts',
  output: {
    file: 'public/bundle.esm.min.js',
    format: 'es',
    sourcemap: true
  },
  plugins: [
    typescript({
      include: ['src/**/*.ts']
    }),
    resolve(), // prise en charge des modules depuis node_modules
    commonjs(),// prise en charge de require
    postcss(), // use postcss plugin
    babel({
      babelHelpers: 'bundled',
      exclude: "node_modules/**"
    }), // transpilation
    production && terser({ format: { comments: false } }), // minify, but only  in production
 ]
};

const conf = process.env.BABEL_ENV === 'esm' ? esm : iife;
export default conf;