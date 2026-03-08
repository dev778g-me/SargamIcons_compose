package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiHammerAlt: ImageVector
    get() {
        if (_SiHammerAlt != null) {
            return _SiHammerAlt!!
        }
        _SiHammerAlt = ImageVector.Builder(
            name = "Regular.SiHammerAlt",
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
                moveToRelative(18.657f, 6.657f)
                lineToRelative(-1.414f, -1.414f)
                moveToRelative(-3.536f, 6.364f)
                lineToRelative(-8.061f, 9.475f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.263f, 0f)
                lineToRelative(-0.565f, -0.566f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.262f)
                lineToRelative(9.475f, -8.062f)
                moveToRelative(3.535f, 3.536f)
                lineToRelative(3.536f, -3.536f)
                moveToRelative(-9.192f, -2.12f)
                lineToRelative(3.535f, -3.536f)
                moveToRelative(-5.091f, 0.848f)
                lineTo(11.02f, 2.98f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.131f, 0f)
                lineToRelative(8.769f, 8.768f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.131f)
                lineToRelative(-2.405f, 2.405f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.131f, 0f)
                lineTo(8.616f, 6.515f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.13f)
            }
        }.build()

        return _SiHammerAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiHammerAlt: ImageVector? = null
