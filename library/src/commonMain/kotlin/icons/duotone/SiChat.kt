package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiChat: ImageVector
    get() {
        if (_SiChat != null) {
            return _SiChat!!
        }
        _SiChat = ImageVector.Builder(
            name = "Duotone.SiChat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(19f, 16f)
                horizontalLineToRelative(-2.525f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.775f, 0.375f)
                lineToRelative(-2.925f, 3.65f)
                curveToRelative(-0.4f, 0.5f, -1.162f, 0.5f, -1.562f, 0f)
                lineToRelative(-2.925f, -3.65f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.512f, 16f)
                horizontalLineTo(5f)
                curveToRelative(-1.662f, 0f, -3f, -1.338f, -3f, -3f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.662f, 1.338f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.663f, 0f, 3f, 1.338f, 3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.662f, -1.337f, 3f, -3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                horizontalLineToRelative(-2.525f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.775f, 0.375f)
                lineToRelative(-2.925f, 3.65f)
                curveToRelative(-0.4f, 0.5f, -1.162f, 0.5f, -1.562f, 0f)
                lineToRelative(-2.925f, -3.65f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.512f, 16f)
                horizontalLineTo(5f)
                curveToRelative(-1.662f, 0f, -3f, -1.338f, -3f, -3f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.662f, 1.338f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.663f, 0f, 3f, 1.338f, 3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.662f, -1.337f, 3f, -3f, 3f)
                close()
            }
        }.build()

        return _SiChat!!
    }

@Suppress("ObjectPropertyName")
private var _SiChat: ImageVector? = null
