interfaces {
    ethernet eth0 {
        address "172.20.20.13/24"
        address "3fff:172:20:20::8/64"
        description "Management Interface"
    }
    ethernet eth1 {
        description "P1"
    }
    ethernet eth2 {
        address "172.16.45.4/24"
        address "fd01:101:2d::4/64"
        description "CE2"
        vrf "VRF1"
    }
    loopback lo {
        address "2001:db8:4:ffff::4/128"
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU3MTRaFw0yNzAzMTAyMjU3MTRaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJsYWItdnlvcy1wYyBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCm6EPsI2J8ApuuS94MZWjn0G7hfMRKmzOiNf65mME+F/jtKZZ0FtcQiIB3XK00Zgps2rzddM8qkHtVDiS71vrKKgvb3V2EnobxeMIzxKa9V+R5pkG+f3kTbFlw7Tf/0YJvcvx2joYyiwc7HruMOGOslnxaIjxBPVlW99ol6mIom3gJPnynL6tcrMu8dkVyGSvucLyIOxLuuzo0y+sgQanAj0pElMm9x4QtYdHY+cLjkhQn+TAo2GECT+W5KMy0LLO3PpZDv5Soa1iUUPuz53d9Sy4j8E8S5hncMBhnHfwr5IM6ws1D94ugaQPaRxo3y2ymiIwJH/Pc3I5pKlZqztQvAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUxT5Yc054SBkm6+JF5azEtVQNv1AwDQYJKoZIhvcNAQELBQADggEBABe+15CQ8mC3wN6+M7z1n/el9O/kF+QHRm2zAlybWVc2oPKxY7V2xBlMYcbjvI2nV0ALkTLrIO9QOBW4ChcO4suuBoUq1UyxiAaGpt0uu9dzxehN6qN+afeZ02Pv5lsmBp03sJvYWwVxrc7FzGC5G+cme405Jck7iKPV7Zry/o98f1SCzQVIAaTpztZMpVD6Us3jfaYhlCJerqvHC8Q4DPxrNwlxZJ3o2arFD+C4WGz4QfqMinIiuyBbPJCydbE9In07HxrhZjBJx3cjTuyvBFXNG23EAtSk1BC3a4V8gjv4HO/ma95r8vmZJNEzmsFSLEmmBmET/fhD0jcWWRI5I7c="
    }
    certificate self {
        certificate "MIIDzjCCAragAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEmxhYi12eW9zLXBjIGxhYiBDQTAeFw0yNjAzMTAyMTU5MTZaFw0yNzAzMTAyMjU5MTZaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJQRTIubGFiLXZ5b3MtcGMuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDSiigXPhpnOSGA7tSSG2LRFdBxFUM5RAXJkv3v6y5NCfyjjox/xFjLC2m7MWWrWCADZ6ew5pBSm0mHsWK6Ox9dHmxM1gs+amJTRSjxNLGzmUIjQEXCD32ElQ6G+LUwp+vUkYcpfGfseE+j3YzjETQWPt7ElZfQ6zDxdCWI0IYp++ptoUS/pgaPOH6g0uCYtrgDKxXd3FggxwgZHkhowtYaiCsFtLBmO651rSl+PNtoegl2ZmO/oNaMsvPFhocwVe3h5KpWQHa86vioDvJ04aRM45jofAzMTjCf5mhJiP/UDuD/HLumHxp7w4pWGSIuPlF7SUtPOzonlDI3Dy6j+CJjAgMBAAGjgaMwgaAwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUxT5Yc054SBkm6+JF5azEtVQNv1AwPgYDVR0RBDcwNYIDUEUyghRjbGFiLWxhYi12eW9zLXBjLVBFMoISUEUyLmxhYi12eW9zLXBjLmlvhwSsFBQNMA0GCSqGSIb3DQEBCwUAA4IBAQA/XWDhzLAZh7zNP9zXRTPCRPRr4G9KyZqQ+MUXixHB+rsw0TEm8nl+ZixLbs2sFU5BX7ZnCgktHmv4z6R06qCbPFWOh0Y/qBlmfZOzRwcZGyUpIYxNRJQKk1SC5t9hI8HZIIZDKB1kvWp26ppzeA+D4ebXpA++1x7Px/YPAWEPde5ZvFH/Vmb27hbX2cFTVLDwlhicbA8Gw3NJWOrs697JM5dF34sov7HM7mapRcl7/nS+s33HOkb8axEup2OYlXfGk6yIAS0ynJtwaKRJBGQFcQPNefcws32Br+kXqt/u0mBQi/50S2M2KAmR9jKjhbpj/auNHaRttIt0pq1tmKv5"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDSiigXPhpnOSGA7tSSG2LRFdBxFUM5RAXJkv3v6y5NCfyjjox/xFjLC2m7MWWrWCADZ6ew5pBSm0mHsWK6Ox9dHmxM1gs+amJTRSjxNLGzmUIjQEXCD32ElQ6G+LUwp+vUkYcpfGfseE+j3YzjETQWPt7ElZfQ6zDxdCWI0IYp++ptoUS/pgaPOH6g0uCYtrgDKxXd3FggxwgZHkhowtYaiCsFtLBmO651rSl+PNtoegl2ZmO/oNaMsvPFhocwVe3h5KpWQHa86vioDvJ04aRM45jofAzMTjCf5mhJiP/UDuD/HLumHxp7w4pWGSIuPlF7SUtPOzonlDI3Dy6j+CJjAgMBAAECggEAWFsZkxOBgiNUP6c7N2vdzxBgDy0UrqIw6ZTSFA83OaaAy2UF6pLMjr2l7CTBXaSYnsUv90nzdG9t7s/PNoecVHhxi9diFZoQ1JBYK83o643cVy3geJ4Gl470b0lNxPMbwfQm7I6kkHU3OvY964crPFC7LXX4Jfml6xbKr72PKGuop+v8AIfDSLSsHg9mHPdW1znEyTLXHUQ1qLHKrzL5WjaNNyV1BOXKKdnt/a9PjzpggGTL0Q/HjG77Kfgxz/tRbPjxhfK19rNP39WVxR9lMm6VipZW0EcAkOws9ums1Ua8j+gX6J87KYy9PGD+LW6a5IKGvPto/IxHcHhrrPbwJQKBgQDcUHwM9UVh2iSOdIRV/GDQpTpOZv6N47VS+QfsyMVEfq/gQvTVW5KW/86ktbe4K8LQkwPCs+PR6HelliraQHZwl0MEvaDRN4xyWt6r1cMBYmc2Bf4claeZiv9EtfUl1Htt7yx1zX9y+tVOZ72UcR5R51rOPt6CiZL0Xe0cIl05FwKBgQD0pFr5+NEcz+wbTJFe38RiwbE+R7FWUR/r4BYtctKJsM6j8U5UiNEm/UZt0KEMvodtuzk5vk4Tf+cSlkDwy25sKFoElZnczl0qOyLirj5U3IkN+MWDLMgLUvrOwLERGNGAix4x8tL4hr6K2gp+yBsOt1IttZN9a39n3cwzalpYlQKBgDsgDmqb2EbueCkS9ADvfjwAW6l20pHZrmvaEVpmdypupVyWG4a20JxdgmOJsQhoFhxLmBLEnDtVG+cAafewnRiSP5YiHeqH8dUutdt/vpm8gt5otU2OjDAUsXULMAM7BvT13wSuZanBz0T/ak1QHkb0w9Xd4XE+4oVaP6vxPPt5AoGBALbtHknDzzjoD/fprNlwIHxnsIyNNwD/8AqDqJGbRepHFnxnttZm511sDPmYApRw8vsN/6A5uE/EV5gCWdSziIG/OnArHL2KYQdu6IrvFxSFQsX7ulR3a61sArYOR1gtYpnnbFCU7UOAHYHdv/NE1VaPpRcgqoQhmUalBkd7wspxAoGBAKOfazoLL7Wma5GINT1/J+SLF2o4hREb/sgqLGeySH/viNNwDfatco4iXXZi9zwT71JYdfnblkrEfcPwtEnoSCw6CdQ9GGX8EXiY7eXZvKemBbhnpySqK0oBipqtoA1p/ZH2x7wbe55ozrfwZshZefvsDRrrt6ihMnUWu7GEoahP"
        }
    }
}
protocols {
    bgp {
        neighbor 2001:db8:2:ffff::2 {
            description "PE1"
            peer-group "PE"
        }
        parameters {
            router-id "10.0.0.4"
        }
        peer-group PE {
            address-family {
                ipv4-vpn {
                    nexthop-self {
                    }
                }
                ipv6-vpn {
                    nexthop-self {
                    }
                }
            }
            capability {
                extended-nexthop
            }
            remote-as "internal"
            update-source "lo"
        }
        srv6 {
            locator "L3VPN"
        }
        system-as "65000"
    }
    isis {
        interface eth1 {
        }
        interface lo {
        }
        level "level-2"
        net "49.0000.4444.4444.4444.00"
        redistribute {
            ipv6 {
                static {
                    level-2 {
                    }
                }
            }
        }
    }
    segment-routing {
        interface eth1 {
            srv6 {
            }
        }
        srv6 {
            locator L3VPN {
                behavior-usid
                prefix "2001:db8:4:aaa::/64"
            }
        }
    }
    static {
        route6 2001:db8:4::/48 {
            blackhole {
            }
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
    host-name "PE1"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$RzAp4mJpIA.LMjOj$T3l0yr2rO.s5u4fZMXrZ683hYF6N8zsnFSZOB3hSz7GAu0QNz9UtzAU1pTpuN8K46FWU/pKY34XnrDD.BTxuc."
            }
        }
    }
    sysctl {
        parameter net.vrf.strict_mode {
            value "1"
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
vrf {
    name VRF1 {
        protocols {
            bgp {
                address-family {
                    ipv4-unicast {
                        export {
                            vpn
                        }
                        import {
                            vpn
                        }
                        rd {
                            vpn {
                                export "10.0.0.4:101"
                            }
                        }
                        redistribute {
                            connected {
                            }
                        }
                        route-target {
                            vpn {
                                export "65000:101"
                                import "65000:101"
                            }
                        }
                    }
                    ipv6-unicast {
                        export {
                            vpn
                        }
                        import {
                            vpn
                        }
                        rd {
                            vpn {
                                export "10.0.0.4:101"
                            }
                        }
                        redistribute {
                            connected {
                            }
                        }
                        route-target {
                            vpn {
                                export "65000:101"
                                import "65000:101"
                            }
                        }
                    }
                }
                neighbor fd01:101:2d::5 {
                    peer-group "CE"
                }
                parameters {
                    router-id "10.0.0.4"
                }
                peer-group CE {
                    address-family {
                        ipv4-unicast {
                        }
                        ipv6-unicast {
                        }
                    }
                    remote-as "external"
                }
                sid {
                    vpn {
                        per-vrf {
                            export "101"
                        }
                    }
                }
                system-as "65000"
            }
        }
        table "101"
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@20:flow-accounting@3:https@7:ids@2:interfaces@34:ipoe-server@4:ipsec@14:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:nhrp@1:ntp@3:openconnect@3:openvpn@5:ospf@2:pim@1:policy@9:pppoe-server@11:pptp@5:qos@3:quagga@12:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@3:sstp@6:system@31:vpp@4:vrf@4:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 2026.01.24-0021-rolling
