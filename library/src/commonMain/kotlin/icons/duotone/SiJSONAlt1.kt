package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiJSONAlt1: ImageVector
    get() {
        if (_SiJSONAlt1 != null) {
            return _SiJSONAlt1!!
        }
        _SiJSONAlt1 = ImageVector.Builder(
            name = "Duotone.SiJSONAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-1.626f, -0.009f, -2.408f, -0.306f, -2.408f, -2.01f)
                verticalLineToRelative(-4.172f)
                curveToRelative(0f, -1.215f, -1.45f, -1.774f, -2.408f, -1.862f)
                verticalLineToRelative(-0.166f)
                curveToRelative(0.967f, -0.087f, 2.408f, -0.69f, 2.408f, -1.887f)
                verticalLineTo(6.01f)
                curveToRelative(0f, -1.695f, 0.782f, -2.001f, 2.408f, -2.01f)
                horizontalLineTo(7f)
                moveToRelative(10f, 16f)
                horizontalLineToRelative(0.184f)
                curveToRelative(1.626f, -0.009f, 2.408f, -0.306f, 2.408f, -2.01f)
                verticalLineToRelative(-4.172f)
                curveToRelative(0f, -1.215f, 1.45f, -1.774f, 2.408f, -1.862f)
                verticalLineToRelative(-0.166f)
                curveToRelative(-0.967f, -0.087f, -2.408f, -0.69f, -2.408f, -1.887f)
                verticalLineTo(6.01f)
                curveToRelative(0f, -1.695f, -0.782f, -2.001f, -2.408f, -2.01f)
                horizontalLineTo(17f)
                moveTo(9f, 16f)
                verticalLineToRelative(-1f)
                moveToRelative(3f, 1f)
                verticalLineToRelative(-1f)
                moveToRelative(3f, 1f)
                verticalLineToRelative(-1f)
            }
        }.build()

        return _SiJSONAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiJSONAlt1: ImageVector? = null
