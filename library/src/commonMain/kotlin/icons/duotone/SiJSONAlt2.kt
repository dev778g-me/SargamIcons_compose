package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiJSONAlt2: ImageVector
    get() {
        if (_SiJSONAlt2 != null) {
            return _SiJSONAlt2!!
        }
        _SiJSONAlt2 = ImageVector.Builder(
            name = "Duotone.SiJSONAlt2",
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
                moveTo(8.2f, 3f)
                horizontalLineToRelative(-0.99f)
                quadToRelative(-0.864f, 0f, -1.494f, 0.321f)
                quadToRelative(-0.63f, 0.304f, -0.954f, 0.911f)
                quadToRelative(-0.306f, 0.59f, -0.252f, 1.447f)
                lineToRelative(0.27f, 3.535f)
                quadToRelative(0.09f, 0.983f, -0.306f, 1.393f)
                quadTo(4.096f, 11f, 2.98f, 11f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.98f)
                quadToRelative(1.116f, 0f, 1.494f, 0.393f)
                quadToRelative(0.396f, 0.41f, 0.306f, 1.393f)
                lineToRelative(-0.27f, 3.535f)
                quadToRelative(-0.054f, 0.858f, 0.252f, 1.447f)
                quadToRelative(0.324f, 0.607f, 0.954f, 0.91f)
                quadToRelative(0.63f, 0.322f, 1.494f, 0.322f)
                horizontalLineToRelative(0.99f)
                moveTo(16f, 3f)
                horizontalLineToRelative(0.99f)
                quadToRelative(0.864f, 0f, 1.494f, 0.321f)
                quadToRelative(0.63f, 0.304f, 0.954f, 0.911f)
                quadToRelative(0.306f, 0.59f, 0.252f, 1.447f)
                lineToRelative(-0.27f, 3.535f)
                quadToRelative(-0.09f, 0.983f, 0.306f, 1.393f)
                quadToRelative(0.378f, 0.393f, 1.494f, 0.393f)
                horizontalLineToRelative(0.98f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.98f)
                quadToRelative(-1.116f, 0f, -1.494f, 0.393f)
                quadToRelative(-0.396f, 0.41f, -0.306f, 1.393f)
                lineToRelative(0.27f, 3.535f)
                quadToRelative(0.054f, 0.858f, -0.252f, 1.447f)
                arcToRelative(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.954f, 0.91f)
                quadToRelative(-0.63f, 0.322f, -1.494f, 0.322f)
                horizontalLineTo(16f)
                moveToRelative(-7f, -5f)
                verticalLineToRelative(-1f)
                moveToRelative(3f, 1f)
                verticalLineToRelative(-1f)
                moveToRelative(3f, 1f)
                verticalLineToRelative(-1f)
            }
        }.build()

        return _SiJSONAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiJSONAlt2: ImageVector? = null
