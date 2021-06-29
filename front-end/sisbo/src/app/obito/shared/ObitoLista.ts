import { Documento } from "./Documento";

export class ObitoLista{
    id: number;
    ufEstado: string;
    documentos: Documento[];
    falecidoNome: string;
    tipoObito: string;
}