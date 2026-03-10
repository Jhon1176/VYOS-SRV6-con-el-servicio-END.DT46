interfaces {
    ethernet eth0 {
        address "172.20.20.14/24"
        address "3fff:172:20:20::5/64"
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
        certificate "MIIDzjCCAragAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU3MTRaFw0yNzAzMTAyMjU3MTRaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJDRTEubGFiLXZ5b3MtcGMuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCZaqDhQ0mf883rcogjyxqJ9dIQ9n5jEFrQ8V3+iAL5rvfZ1Mv4NotskxzizVFxsMJoBm/56aur8JvBFc+s6NBwosVKdYFpJpdafXBC65zrEas2BtzrpbLDd0V1JAb/wypHH+CZdoOY+eng1UfzDK374J/g7Q+n7POhpVd8MxEwaTENc1HD0OIcGB0Gnos6RVM5JuFZE4QW4v2ExUdAONCjZTXAMoQ0GZY/nrHjvRcBAOi+g+1CUKjOBLr2sEbhDGMCZlcpn26H8LPv24odQhv6FqIACe06GAycSDBbEdm6IFoZCVWR64fXUy8fY5is2s6QgspRshQNpMUWZFwcoI0/AgMBAAGjgaMwgaAwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUxT5Yc054SBkm6+JF5azEtVQNv1AwPgYDVR0RBDcwNYIDQ0UxghRjbGFiLWxhYi12eW9zLXBjLUNFMYISQ0UxLmxhYi12eW9zLXBjLmlvhwSsFBQOMA0GCSqGSIb3DQEBCwUAA4IBAQBJ0Y6OI2MuKW3x9iBll15OybvbIilr5D/2NeB5TAQu0EqX9VfIZz2liWGIUGFA1ZwZLCJ/uskCupTNyeP2tPTw1h6ER05CKU+3sXyUGR0f7jiVkiR4N6lEzG51KvqgW+2Q6UTjdkRV97Z8mq7I92sqeP5zdNhw5D+xRLZXSelawEbAinx4niR4OdMK063L/2XHfPyXj6fjJ5gZifVYFrN+wc/hF3iHldoncJ9Z2bEBKT4RGf5ud7+7/GqMuyEi4IMeGX1qwCujItscCAuUpnCkmGHeNPyhSX/hCffWyC/pAhRpQR9Zb/E0Ejlp//kM3jFkKTDM4jwPFqlUsHeKsSAD"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCZaqDhQ0mf883rcogjyxqJ9dIQ9n5jEFrQ8V3+iAL5rvfZ1Mv4NotskxzizVFxsMJoBm/56aur8JvBFc+s6NBwosVKdYFpJpdafXBC65zrEas2BtzrpbLDd0V1JAb/wypHH+CZdoOY+eng1UfzDK374J/g7Q+n7POhpVd8MxEwaTENc1HD0OIcGB0Gnos6RVM5JuFZE4QW4v2ExUdAONCjZTXAMoQ0GZY/nrHjvRcBAOi+g+1CUKjOBLr2sEbhDGMCZlcpn26H8LPv24odQhv6FqIACe06GAycSDBbEdm6IFoZCVWR64fXUy8fY5is2s6QgspRshQNpMUWZFwcoI0/AgMBAAECggEAA+4uZvcBWN63JNQPVtNqP6STmCmofUM7AGVeohm78cegw+zmuNo04jg2ojzeXEpKAL5BeiaZZlNIuj6jzms8g9Y3tbui8B2z/PZ/vMcqgv814rF0UXkyRj21AtZEc6L9X0saxvO5VV75te/g4wItJunPTsTkBMpWR4rj3eO1CgdtuakGhpfY42JI6k0cRmVv3JC4X8gOO4hl72Z8uvkPKkbkSazj7JiFsxSjZELxmPZTL/OuR3pZs4TnscMt6DgxLtbNdIUEWEyT+KmCagZ6t0rbqTtJUZ08pJf9yDWV4GOF54I9DHU/S2Q+jNFCE5tpJI5OPUiOosM0jK2A6rQgIQKBgQDElHXkShr0lt40zDD1j5Zghg5Q1ioT84AmkR7ZvhhpPlfxT2m6qWRrJGFuZi1nYITNbZYq+dBnXnTNJnL734uJol2NzfvoqQqoEUJ4qaEIqyntqI8NrAnesY0r5jCjdaGmnM8MJPMC31kvlpcoIzeWhho+pQOJ1tGPc9QiOj8LzwKBgQDHyiSVojYVR8DzkwKdNos6+IjK++isbWQj+w6Lx6+NxC98xMTiUhKWqNWCyBGdCijVmCc0nN/T+yJE7OxhgsjBIJu5c6hFLKvCzIhv5xEHc0cglT0w1mUMjSst5fUsNVbcfsxFDN5U/sFwqLHF8T55JrMirycBPu4mQNIn3G2TkQKBgG9nx4wyJyaYXaPEWLbBwjI/pttPFBesduLkeXxjDAiQ6Vv7amr71soVmxXq2C5u97RIN8NxQhdi44TkFmQB412D48sagnnvWve2mFozn+x+vEtQrInOBuXq75uCX+wzHQKEeZ5jTklBdJTQnieEFdu7ciIweFnkoWzP8tfW9KXnAoGBALpmjfWRrzXxiUN34JN/ZS1y3mXL3AyrzyeGv86IUvFInimhiDPD8RXhlbr8IPrMlMabu9BpoKctgo6eIfjkRZtyaff/wXowsFwB6jXFduzlj/IFa17aWNL6DtQ23aUOaukz4C94TyMrwJz0t0//wZLVGYL9ub1+0kCcb7bDAPURAoGAFM6ZjlkmlM6N78VyD6gqWqL1gCc/VP/TEq3bNFcg8MMg6Bg3Xrw9Jo+yBzpi+ca7/+ESkaCWcxIKOqUXj7LTXlhAwKlflyRZRPSHiR6euQ2okidAJHg9esdBQYETletVNOJBRFIF92Vcz3DvtbwXR9uUvOCalMwdOidqpKAI8HA="
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
    host-name "CE1"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$3qni2Igo5bTjIKDH$WLsS.4QceMal.1uXzhX16GrwJ7QpwMim5th7xmff7RlojMUKg0/CwUrXIk.lAL4vpeJYgE1cN7a6kAJaTMGJU."
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
