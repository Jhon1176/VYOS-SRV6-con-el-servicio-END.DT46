interfaces {
    ethernet eth0 {
        address "172.20.20.15/24"
        address "3fff:172:20:20::3/64"
        description "Management Interface"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU3MTRaFw0yNzAzMTAyMjU3MTRaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJsYWItdnlvcy1wYyBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCm6EPsI2J8ApuuS94MZWjn0G7hfMRKmzOiNf65mME+F/jtKZZ0FtcQiIB3XK00Zgps2rzddM8qkHtVDiS71vrKKgvb3V2EnobxeMIzxKa9V+R5pkG+f3kTbFlw7Tf/0YJvcvx2joYyiwc7HruMOGOslnxaIjxBPVlW99ol6mIom3gJPnynL6tcrMu8dkVyGSvucLyIOxLuuzo0y+sgQanAj0pElMm9x4QtYdHY+cLjkhQn+TAo2GECT+W5KMy0LLO3PpZDv5Soa1iUUPuz53d9Sy4j8E8S5hncMBhnHfwr5IM6ws1D94ugaQPaRxo3y2ymiIwJH/Pc3I5pKlZqztQvAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUxT5Yc054SBkm6+JF5azEtVQNv1AwDQYJKoZIhvcNAQELBQADggEBABe+15CQ8mC3wN6+M7z1n/el9O/kF+QHRm2zAlybWVc2oPKxY7V2xBlMYcbjvI2nV0ALkTLrIO9QOBW4ChcO4suuBoUq1UyxiAaGpt0uu9dzxehN6qN+afeZ02Pv5lsmBp03sJvYWwVxrc7FzGC5G+cme405Jck7iKPV7Zry/o98f1SCzQVIAaTpztZMpVD6Us3jfaYhlCJerqvHC8Q4DPxrNwlxZJ3o2arFD+C4WGz4QfqMinIiuyBbPJCydbE9In07HxrhZjBJx3cjTuyvBFXNG23EAtSk1BC3a4V8gjv4HO/ma95r8vmZJNEzmsFSLEmmBmET/fhD0jcWWRI5I7c="
    }
    certificate self {
        certificate "MIIDzjCCAragAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU3MTRaFw0yNzAzMTAyMjU3MTRaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJDRTIubGFiLXZ5b3MtcGMuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQChnWH0vtqGkCEyFG4Xyy+SVdyZ2x9VRdywbcIQKI4F3Nb8f87BwTreZt3+wqbqbhgWEqy2FjxQcbF2DSCiDgPqlykabhsuvdgz44JZ7HBwUFhJNh8/SkxaNfgodeZu6PdqdiYSPspNJFORqJU3Z9lJuiWlR+MO9K59VYejCXoBAPPaPHgTxV9Jxi4ZQ/93NFn+1uufpZjvIML3GIs/MmZUbBHwXxf/qMYGvMsn8Ie6WzNcEu4LmIW67Fb0Tn63rgoUH+EniqQO/ZPoYlNWVXt0OyDKCv1QzhmV0IoKYO9Isb0r5dIqu6IYD7ihH7bV+ZS3PeVeGnSvODgcSXkCJz0TAgMBAAGjgaMwgaAwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUxT5Yc054SBkm6+JF5azEtVQNv1AwPgYDVR0RBDcwNYIDQ0UyghRjbGFiLWxhYi12eW9zLXBjLUNFMoISQ0UyLmxhYi12eW9zLXBjLmlvhwSsFBQPMA0GCSqGSIb3DQEBCwUAA4IBAQAR71W6dYMQDjWbpnRxo/1u0c0rSYY30+adD5YQt77//QmaeCDRdIzs5BtoCqeSjgEp8/yQxIMbc5eNwNjg5CsCG2hGwh0TVzNbFf7lgMW6fpcl+Q5rQnyhsHfhrQjb/UczR7N/m/uD1TbKPMl2lq1EkfV93RZLQ68DuuZYkTsfc4dtQVLtjcGj6VPLPLG7k9oJ8Km24EQ22or4hL2g+w2y9GrS941zBAYKEbShsKakBf6He+I2d276vgmZhDQj3xVabttZubHJTLPDwUJaVSHpYUm3N1qjTUhLLJFx56wx2S2v8tx4InwQvlcsfCR2aQwslHgVY7ANLnfc34Bd4Xmw"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQChnWH0vtqGkCEyFG4Xyy+SVdyZ2x9VRdywbcIQKI4F3Nb8f87BwTreZt3+wqbqbhgWEqy2FjxQcbF2DSCiDgPqlykabhsuvdgz44JZ7HBwUFhJNh8/SkxaNfgodeZu6PdqdiYSPspNJFORqJU3Z9lJuiWlR+MO9K59VYejCXoBAPPaPHgTxV9Jxi4ZQ/93NFn+1uufpZjvIML3GIs/MmZUbBHwXxf/qMYGvMsn8Ie6WzNcEu4LmIW67Fb0Tn63rgoUH+EniqQO/ZPoYlNWVXt0OyDKCv1QzhmV0IoKYO9Isb0r5dIqu6IYD7ihH7bV+ZS3PeVeGnSvODgcSXkCJz0TAgMBAAECggEARXvFQDUH/d+crgvTk35Diy5IJIvtijt5mQ7vZwQQn5ulgLSwX2Qk27atThlBKzw/Nco8oCKqNsnSytb1B0dwTp1Dyj25iRyNBi4T/nZllxwsAPn4cD0Q254lfbvG4TtfGFIIp0KAtq7eERtCYCpRZN3Xzpo8GFOBa5hosuNhpWklBt22Cst82vwYFUQD02lalNPfmVH2t2SQgf34vjaVpLBxQm9qWjFn1bChX3ObIcXws3CYhPOK1/lzdX4RxKd/OKndKyFTr4lg+nvoyFi2AXsv0fr8Qr7dmLMb6HRg3mCuvpEHonj7z+ukdYQRqLXPY2AQs62E48LnczCFRfGL5QKBgQDKsbfsp4jOVe+ccMgPu0OhjjdTF7xVRjzap6OFKxZ1i+JVh1nM93Lai5JxwOZAxV/gAuue6nmKEU70rr1iQsfJzg1vZUBSSyl4CCmFfKe8bC3dDQ5bVw/RXhi708jMwAcDcv6WnZQCyNTtq7I324hs5SbtdycpDm67ZyoCyDiL/QKBgQDMHgM9SWXLlP+tFGgHc+Ypv8lalWhB+u44cwOFGjmt0fIEKQQDkq1ZgIyIM5yDcgIA88F27/xRoVXLa3QW5Owacu+Wy+AqQxb6iZ1UQpg0pIIl3itOxtlnbRESBwmoBqpTGSvvnTG9tfJ4/wbBLrKytK4bO9k/FmEONTBkpWFSTwKBgQCjIX8eZwOS1NUAekB5cMSQnI3oQR0hIGNPs0XGopPzzL4/Caz7ale0jkoxZQerL27nMlKB1sI0nZOHF69yCr8SqtRjSAEJelaItUD9nwK8gfAzjRN17c7cOTf8ywk7yHyciQtfGrmJuCqukdXgYL4erhqzWYdZ4rS5/OBx1sSz3QKBgDRWLbZ1L2i316blaJcgnI9v4Y0cahMg6BwJQYnLY6ayAkAW1DSmU1RzpZT2xtbdUK410hFRD31OxNTXxHhqUi+l8NDVjbDIawfqaTDFsoks9UIIaUpVqkDeslXRACTZMKsF9UIHKE3gbT+hBHZcJu2zbkEFY3rNni0qbjIgRYf5AoGAWjQQmRCScmr/7JNZFfm4DjJv56dOPhlPsNEzJzbih8g8xhfE7Rn/6/C2nnec+SdYkGVFPfdXSGai0F/bpooRAHlPeedO8YCFFDD5JKxwxglVdAdLouALX8+dm+wXuZhdkz3QIJJlV9oMt7heq2R9F5CT9aOEcerCx0Pvj6Uy6Mg="
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "CE2"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$fgfjqNX60UnH3Lr7$BHc9zJ0dM7PdJEUVlESlgMM6WiHtRGxLf1/EF.YrbRdCdc.3R7h7x.VCDVSpnCjwnsXeRlibpQ3iBLqMlfJql1"
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@20:flow-accounting@3:https@7:ids@2:interfaces@34:ipoe-server@4:ipsec@14:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:nhrp@1:ntp@3:openconnect@3:openvpn@5:ospf@2:pim@1:policy@9:pppoe-server@11:pptp@5:qos@3:quagga@12:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@3:sstp@6:system@31:vpp@4:vrf@4:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 2026.01.24-0021-rolling
