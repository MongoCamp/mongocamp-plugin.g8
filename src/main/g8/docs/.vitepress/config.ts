import Unocss from 'unocss/vite'
import {defineConfig} from 'vitepress'
import {version} from '../../package.json'

export default defineConfig({
    lang: 'en-US',
    title: '$name$',
    description: '$name$ Plugin for MongoCamp Server',

    lastUpdated: true,

    themeConfig: {
        logo: '/logo_without_text.png',

        nav: nav(),

        search: {
            provider: 'local'
        },

        sidebar: {
            '/documentation/': sidebarDocumentation()
            // '/config/': sidebarConfig(),
            // '/plugins/': sidebarPlugins()
        },

        editLink: {
            pattern: 'https://github.com/$github_user_or_organisation$/$github_repo_name$/edit/master/docs/:path',
            text: 'Edit this page on GitHub'
        },

        socialLinks: [
            {icon: 'github', link: 'https://github.com/$github_user_or_organisation$/$github_repo_name$'}
        ],

        footer: {
            message: 'Released under the Apache License 2.0.',
            copyright: 'Copyright © 2023'
        },

    },
    vite: {
        plugins: [
            Unocss({
                configFile: '../../unocss.config.ts',
            }),
        ],
    },

})

function nav() {
    return [
        {
            text: 'Documentation',
            items: [
                {text: 'Getting Started', link: '/documentation/getting-started'},
                {text: 'Configuration', link: '/documentation/configuration'}
            ]
        },
        {
            text: version,
            items: [
                {
                    text: 'Changelog',
                    link: '/changelog.html'
                },
            ],
        },

    ]
}

function sidebarDocumentation() {
    return [
        {
            text: 'Getting Started',
            link: '/documentation/getting-started'
        },
        {
            text: 'Configuration',
            link: '/documentation/configuration'
        }
    ]
}
