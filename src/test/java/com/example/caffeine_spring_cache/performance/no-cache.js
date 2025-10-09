import http from 'k6/http';
import { check } from 'k6';

export const options = {
    vus: 50,        // 50 usuários virtuais
    duration: '20s' // por 20 segundos
};

export default function () {
    const res = http.get('http://localhost:8080/order/no-cache/1');
    check(res, {
        'status 200': (r) => r.status === 200,
    });
}