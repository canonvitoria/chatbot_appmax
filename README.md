# Projeto: Sistema de Rastreio Automatizado via WhatsApp - Appmax

## 1. Descrição Geral

O objetivo deste projeto é desenvolver um sistema de rastreio de entregas automatizado via WhatsApp para a Appmax. A solução visa resolver os problemas atuais causados pela falta de automação, que gera retrabalho, aumenta os custos com suporte e cria atritos na jornada do cliente.

A solução proposta automatizará o envio de atualizações de status de pedidos de forma proativa, incluindo:
* Confirmação de compra
* Código de rastreio
* Aviso de "pedido em trânsito" ou "entregue"

## 2. Solução Técnica

A primeira parte da solução é desenvolver um layout web para a divulgação na plataforma da AppMax, a segunda será um bot que enviará mensagens automáticas em momentos-chave da jornada de entrega, utilizando dados de rastreio obtidos via API para garantir atualizações precisas e em tempo real.

## 3. Requisitos

* **Sistema de Mensagens via WhatsApp:** A aplicação é capaz de enviar mensagens automatizadas.
* **Integração:** A solução se integra ao sistema de rastreio de pedidos para obter atualizações de status.
* **Fluxo de Mensagens:** O sistema envia três tipos de mensagens: confirmação de compra, código de rastreio e atualizações de status ("Saiu para entrega" e "Entregue").

## 4. Stack de Tecnologia (Trilha Java)

* **Back-End:** Java com o framework Spring Boot.
* **Integração WhatsApp:** API oficial do WhatsApp Business ou um provedor de terceiros (Ex: Twilio, Zenvia).
* **Front-End:** React para a aplicação web.
* **Arquitetura:** A arquitetura é robusta e escalável, capaz de lidar com um grande volume de mensagens e integrações em tempo real.

## 4. Stack de Tecnologia (Trilha IA e Dados)
* **Arquitetura de Dados:** Projeto de um banco de dados para armazenar informações de rastreio e interações do chatbot.
* **Análise de Dados:** Desenvolvimento de relatórios para analisar o impacto da solução (ex: redução de chamados).
* **Automação Inteligente:** Utilização de IA preditiva para antecipar problemas de entrega ou prever a necessidade de suporte.

## **Pré-requisitos:**
* Java JDK (21)
* Maven
* Postgress
* Chaves de API (WhatsApp e Rastreio)
