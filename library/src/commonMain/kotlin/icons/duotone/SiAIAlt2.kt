package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAIAlt2: ImageVector
    get() {
        if (_SiAIAlt2 != null) {
            return _SiAIAlt2!!
        }
        _SiAIAlt2 = ImageVector.Builder(
            name = "Duotone.SiAIAlt2",
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
                moveTo(10f, 12f)
                verticalLineTo(6.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineTo(4.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(12f)
                moveToRelative(6f, 0f)
                verticalLineToRelative(6f)
                moveToRelative(0f, -6f)
                horizontalLineTo(4f)
                moveToRelative(0f, 6f)
                verticalLineToRelative(-6f)
                moveToRelative(13f, 6f)
                verticalLineTo(6f)
                moveToRelative(0f, 12f)
                horizontalLineToRelative(-3f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(3f)
                moveTo(17f, 6f)
                horizontalLineToRelative(-3f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _SiAIAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIAlt2: ImageVector? = null
