# README - Implementación Exitosa de la API REST para Simulaciones de Contrataciones de Tarjetas de Crédito

¡Bienvenido al proyecto de implementación de la API REST para simulaciones de contrataciones de tarjetas de crédito! Aquí encontrarás una guía detallada sobre cómo abordar y resolver este desafío, combinando conocimientos en Java, ASO, APX, Docker y Postman.

## Objetivo

El propósito principal de este proyecto es construir una API REST eficiente que pueda gestionar simulaciones de contrataciones de tarjetas de crédito. Esto se logra mediante la recepción de peticiones POST con datos en formato JSON y la aplicación de validaciones detalladas.

## Escenario ASO

### Request del Servicio ASO

La API recibe un JSON con detalles específicos sobre la simulación de contratación, gestionandolo por @PathParam

#### Ejemplo:

- PathParam: `http://localhost:7500/TechArchitecture/helloWorld/v0/simulations/{nuip}`
  
#### Validaciones Realizadas:

- **Tipo de Oferta (`details.offerType`):** *Está validado que sea el mismo en la entrada y la respuesta, asegurando que solo ingresen mayúsculas.*

- **Cantidad Máxima Permitida (`details.limitAmount.amount`):** *Se ha verificado que no sea nula.*

- **Moneda (`details.limitAmount.currency`):** *Confirmado que no sea nula ni vacía.*

- **Identificador del Producto (`details.product.id`):** *Validado mediante un regex que sea igual a "TDC".*

- **Subproducto (`details.product.subproduct.id`):** *Se ha asegurado de que solo contenga de 0 a 2 caracteres.*


```json
{
  "details": {
    "offerType": "CARD_HOLDER",
    "limitAmount": {
      "amount": 200000,
      "currency": "EUR"
    },
    "product": {
      "id": "TDC",
      "subproduct": {
        "id": "AV"
      }
    }
  }
}```






![diapo1](https://github.com/EnriqueVOZA/VozmedianoEnrique_PruebaTecnica_ASO/assets/92337660/4f973a68-6d0e-4b17-a74d-c090fb8ad991)
![diapo2](https://github.com/EnriqueVOZA/VozmedianoEnrique_PruebaTecnica_ASO/assets/92337660/14521d74-2362-4e5b-8328-351d2522ddc4)


